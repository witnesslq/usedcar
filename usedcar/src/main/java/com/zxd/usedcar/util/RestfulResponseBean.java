package com.zxd.usedcar.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class RestfulResponseBean {

	private static final ObjectMapper mapper = new ObjectMapper();

	private int code;// 返回码
	private Object data;// 返回数据
	private String msg;// 消息
	private String version;// 版本号

	public RestfulResponseBean(int code, Object data, String msg, String version) {
		super();
		this.code = code;
		this.data = data;
		this.msg = msg;
		this.version = version;
	}

	public int getCode() {
		return code;
	}

	public Object getData() {
		return data;
	}

	public String getMsg() {
		return msg;
	}

	public String getVersion() {
		return version;
	}

	public String toJSONStr() {
		String str = "{\"code\":" + Restful_Code.INTERNAL_SERVER_ERROR
				+ ",\"msg\":\"server inner erro\",\"data\":null,\"version\":\""
				+ MyConst.VERSION + "\"}";
		try {
			str = mapper.writeValueAsString(this);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public String toString() {
		return "RestfulResponseBean [code=" + code + ", data=" + data
				+ ", msg=" + msg + ", version=" + version + "]";
	}

}
