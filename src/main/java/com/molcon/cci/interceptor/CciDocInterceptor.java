package com.molcon.cci.interceptor;

import com.molcon.cci.cciDocKeyServiceImplement.DocKeyService;
import com.molcon.cci.exception.InvalidDocVec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
public class CciDocInterceptor implements HandlerInterceptor {
    @Autowired
    DocKeyService docKeyService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Map pathVariables = (Map) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        String value = (String) pathVariables.get("doc_key_text");
        System.out.println(value);
        System.out.println("prehandle running");
        if (docKeyService.isDocKeyPresent(value)) {
            return true;
        }
        throw new InvalidDocVec();
    }
}

