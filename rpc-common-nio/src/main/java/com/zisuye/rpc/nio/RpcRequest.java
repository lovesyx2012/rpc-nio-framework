package com.zisuye.rpc.nio;

import java.io.Serializable;
import lombok.Data;

@Data
public class RpcRequest implements Serializable {
  private String className;

  private String methodName;

  private Object[] params;
}
