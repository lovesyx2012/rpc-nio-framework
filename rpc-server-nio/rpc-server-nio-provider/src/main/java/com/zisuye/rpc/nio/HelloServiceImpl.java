package com.zisuye.rpc.nio;

public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHello(String content) {
    System.out.println("request is coming: " + content);
    return "hello " + content;
  }
}
