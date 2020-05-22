package com.zisuye.rpc.nio;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.Getter;

@Getter
public class RpcRequestClientHandler extends SimpleChannelInboundHandler<Object> {

  private Object result;

  @Override
  protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
    this.result = msg;
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    System.out.println("调用出现异常：" + cause);
    ctx.close();
  }
}
