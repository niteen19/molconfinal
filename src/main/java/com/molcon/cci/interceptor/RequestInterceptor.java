package com.molcon.cci.interceptor;

import com.molcon.cci.cciDocKeyServiceImplement.DocKeyService;
import com.molcon.cci.clientAuthService.imple.RequestServiceImple;
import com.molcon.cci.exception.GlobalException;
import com.molcon.cci.exception.InvalidDocVec;
import com.molcon.cci.exception.InvalidIpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
public class RequestInterceptor implements HandlerInterceptor {

    @Autowired
    RequestServiceImple requestServiceImple;

    @Autowired
    DocKeyService docKeyService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestPath = request.getRequestURL().toString();
        if (requestPath.contains("glossary")) {
            System.out.println("prehandle running-- for glossary key");
            if (requestServiceImple.isValidIPAddress(request.getRemoteAddr())) {
                return true;
            } else {
                throw new InvalidIpException();
            }
        }
        if (requestPath.contains("dockeyVec")) {
            System.out.println("prehandle running-- for doc key");
            Map pathVariables = (Map) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
            String value = (String) pathVariables.get("doc_key_text");
            System.out.println(value);
            if (docKeyService.isDocKeyPresent(value)) {
                return true;
            }
            throw new InvalidDocVec();
        }

        return false;
    }

}






