package src.com.service.Impl;

import org.springframework.stereotype.Service;
import src.com.service.DubboService;

@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public String getName() {
        return "this is a Dubbo producer";
    }
}
