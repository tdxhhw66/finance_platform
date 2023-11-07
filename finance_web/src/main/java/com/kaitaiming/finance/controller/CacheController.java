package com.kaitaiming.finance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author houwei
 * @Date 2023/9/25 23:42
 * @Description
 */
@RestController
@RequestMapping("/cache")
public class CacheController {
    /*  public static void main(String[] args) {
        CacheChannel cache = J2Cache.getChannel();
    
        // 缓存操作
        cache.set("aaaaaaa", "1", "Hello J2Cache");
        System.out.println(cache.get("aaaaaaa", "1"));
        cache.evict("aaaaaaa", "1");
        System.out.println(cache.get("aaaaaaa", "1"));
    
        cache.close();
    }*/
}
