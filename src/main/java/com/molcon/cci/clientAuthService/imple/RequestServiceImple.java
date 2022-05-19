package com.molcon.cci.clientAuthService.imple;

import com.molcon.cci.clientAuthModel.AuthorizedAddress;
import com.molcon.cci.clientAuthModel.IpDetail;
import com.molcon.cci.clientRepository.ClientRepo;
import org.apache.commons.net.util.SubnetUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ListIterator;

//Checking valid IP addresses
@Service
public class RequestServiceImple {
    @Autowired
    private ClientRepo clientIpRepository;

    public boolean isIpInRange(String ipRange, String requestIpAddress) {
        SubnetUtils _utils = new SubnetUtils(ipRange);
        _utils.setInclusiveHostCount(true);
        return _utils.getInfo().isInRange(requestIpAddress);
    }

    public boolean isIpInRange_1(String ipAddress, String currentIPAddress) {
        if (ipAddress.contains("/")) {
            System.out.println("Split wala");
            String[] ips = ipAddress.split("/");
            if (ips[0].equals(currentIPAddress)) {
                return true;
            } else {
                int end = ips[0].lastIndexOf(".");
                int start = 0;
                String newIP = ips[0].substring(start, end + 1) + ips[1];
                System.out.println(newIP);
                if (newIP.equals(currentIPAddress)) {
                    return true;
                }
            }

        } else {
            if (currentIPAddress.equals(ipAddress)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidIPAddress(String currentIPAddress) {
        ListIterator<AuthorizedAddress> ipListIterator = clientIpRepository.findAll().get(0).getIpAuthorization().authorizedAddresses.listIterator();
        while (ipListIterator.hasNext()) {
            ListIterator<IpDetail> ipDetailListIterator = (ipListIterator.next().getIpDetails().listIterator());
            while (ipDetailListIterator.hasNext()) {
                String ipAddress = ipDetailListIterator.next().getIp();
                return isIpInRange_1(ipAddress, currentIPAddress);
            }
        }
        return false;
    }
}



