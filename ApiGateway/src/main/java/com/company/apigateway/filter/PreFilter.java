package com.company.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //  인증(Authentication)이나 인가(Authorization)를 하거나, 요청 로깅, 요청의 유효성 검사, 공통 초기화 설정
        log.info("===== START Pre Filter. =====.");

        return null;
    }
}
