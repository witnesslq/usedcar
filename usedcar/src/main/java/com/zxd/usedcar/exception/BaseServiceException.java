package com.zxd.usedcar.exception;

/**
 * 
 * <p>
 * Title:BaseServiceException
 * </p>
 * <p>
 * Description:业务逻辑异常基类
 * </p>
 * <p>
 * Company:Benson Lab
 * </p>
 * 
 * @author Benson
 * @date 2017年12月10日 下午2:49:55
 * @version V1.0.0
 * @email 1455813736@qq.com
 */
public abstract class BaseServiceException extends Exception {

	private int errorCode;// 异常码

	public BaseServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BaseServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BaseServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BaseServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BaseServiceException(int errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public BaseServiceException(int errorCode, String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.errorCode = errorCode;
	}

	public BaseServiceException(int errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public BaseServiceException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public BaseServiceException(int errorCode, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}
}
