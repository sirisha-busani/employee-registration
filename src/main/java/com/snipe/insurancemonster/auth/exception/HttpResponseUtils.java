package com.snipe.insurancemonster.auth.exception;

import org.springframework.util.MultiValueMap;

import com.snipe.insurancemonster.auth.common.GenericRes;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class HttpResponseUtils {
	

	private static final MultiValueMap<String, String> COMMON_HTTP_HEADERS_MAP = new LinkedMultiValueMap<String, String>();

	static {
		COMMON_HTTP_HEADERS_MAP.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);

	}
	
	public static final MultiValueMap<String, String> getCommonHttpHeaders() {
		return COMMON_HTTP_HEADERS_MAP;
	}

	public static final <T> ResponseEntity<byte[]> prepareResponse(final byte[] body,
			MultiValueMap<String, String> header) {
		return new ResponseEntity<byte[]>(body, header, HttpStatus.OK);
	}


	public static final ResponseEntity<GenericRes> prepareErrorResponse(final IMonRestException ex) {
		return prepareErrorResponse(ex, ex.getHttpErrorCode());
	}

	public static final ResponseEntity<GenericRes> prepareErrorResponse(final Throwable ex, final int statusCode) {
		return prepareErrorResponse(ex, statusCode, null);
	}

	public static final ResponseEntity<GenericRes> prepareErrorResponse(final Throwable ex, final int statusCode,
			final String message) {
		GenericRes<Void> genericRes = new GenericRes<Void>(ex);
		if (message != null) { // case when message has to be overridden by custom message
			genericRes.setMessage(message);
		}
		return new ResponseEntity<GenericRes>(genericRes, getCommonHttpHeaders(), HttpStatus.valueOf(statusCode));
	}

	public static final <T> ResponseEntity<GenericRes> prepareSuccessResponse(final T data) {
		return prepareSuccessResponse(data, null, null);
	}

	public static final <T> ResponseEntity<GenericRes> prepareSuccessResponse(final T data, final String message) {
		return prepareSuccessResponse(data, message, null);
	}

	public static final <T> ResponseEntity<GenericRes> prepareSuccessResponse(final T data,
			final MultiValueMap<String, String> headers) {
		return prepareSuccessResponse(data, null, headers);
	}

	public static final <T> ResponseEntity<GenericRes> prepareSuccessResponse(final T data, final String message,
			final MultiValueMap<String, String> headers) {
		final GenericRes response = new GenericRes();
		response.setData(data);
		response.setMessage(message);
		if (headers != null && !headers.isEmpty()) {
			headers.putAll(getCommonHttpHeaders());
			return new ResponseEntity<GenericRes>(response, headers, HttpStatus.OK);
		}
		return new ResponseEntity<GenericRes>(response, getCommonHttpHeaders(), HttpStatus.OK);
	}

}
