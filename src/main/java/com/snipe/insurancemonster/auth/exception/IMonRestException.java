package com.snipe.insurancemonster.auth.exception;


	import static org.apache.http.HttpStatus.SC_OK;
    import java.util.LinkedHashMap;
	import java.util.Map;
	import org.apache.http.HttpStatus;

	public class IMonRestException extends RuntimeException {	
		private static final long serialVersionUID = -977217199574702703L;

		public static int INTERNAL_ERROR_CODE = -1;
		protected int httpErrorCode = SC_OK;
		protected int errorCode = Integer.MAX_VALUE;

		protected String exReason;

		protected Map<String, Object> meta;
		protected Map<String, String> dictionary;

		public IMonRestException() {
			super();
			this.meta = new LinkedHashMap<String, Object>();
		}

		public IMonRestException(String message) {
			super(message);
			this.meta = new LinkedHashMap<String, Object>();
		}

		public IMonRestException(String message, Throwable t) {
			super(message, t);
			this.meta = new LinkedHashMap<String, Object>();
		}

		public IMonRestException(String message, Throwable t, int errCode) {
			this(message, t);
			errorCode = errCode;
		}

		public IMonRestException(String message, Throwable t, int errCode, int httpErrCode) {
			this(message, t);
			errorCode = errCode;
			httpErrorCode = httpErrCode;
		}

		public IMonRestException(int errCode, int httpErrCode, String message) {
			this(message);
			errorCode = errCode;
			httpErrorCode = httpErrCode;
		}

		public IMonRestException(int errCode, int httpErrCode, String message, Throwable t) {
			this(message, t);
			errorCode = errCode;
			httpErrorCode = httpErrCode;
		}

		public String getExReason() {
			return exReason;
		}

		public void setExReason(String exReason) {
			this.exReason = exReason;
		}

		public int getErrorCode() {
			return errorCode;
		}

		public void setErrorCode(int errorCode) {
			this.errorCode = errorCode;
		}

		public int getHttpErrorCode() {
			return httpErrorCode;
		}

		public void setHttpErrorCode(int httpErrorCode) {
			this.httpErrorCode = httpErrorCode;
		}

		public Map<String, Object> getMeta() {
			return meta;
		}

		public void setMeta(Map<String, Object> meta) {
			this.meta = meta;
		}

		public Map<String, String> getDictionary() {
			return dictionary;
		}

		public void setDictionary(Map<String, String> dictionary) {
			this.dictionary = dictionary;
		}

		/**
		 * Common Exceptions
		 */
		public static final class BACKEND_SERVER_ERROR extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public BACKEND_SERVER_ERROR() {
				super(1000, HttpStatus.SC_INTERNAL_SERVER_ERROR, String.format("Backend Server Error, Please Retry."));
			}
		}

		public static final class BACKEND_SERVER_READ_TIMEOUT extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public BACKEND_SERVER_READ_TIMEOUT() {
				super(1001, HttpStatus.SC_GATEWAY_TIMEOUT,
						String.format("Backend Server read timeout Error, Please Retry."));
			}
		}

		public static final class ACCESS_DENIED extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public ACCESS_DENIED() {
				super(1002, HttpStatus.SC_UNAUTHORIZED, String.format("Access denied Error"));
			}
		}

		public static final class FORBIDDEN extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public FORBIDDEN() {
				super(1003, HttpStatus.SC_FORBIDDEN, String.format("Forbidden Error"));
			}
		}

		public static final class SC_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public SC_NOT_FOUND() {
				super(1004, HttpStatus.SC_NOT_FOUND, String.format("Not Found"));
			}
		}

		public static final class BACKEND_PARSE_ERROR extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public BACKEND_PARSE_ERROR() {
				super(1005, HttpStatus.SC_INTERNAL_SERVER_ERROR, String.format("Backend parse Error"));
			}
		}

		public static final class SAVE_FAILED extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public SAVE_FAILED(String message) {
				super(1006, HttpStatus.SC_NOT_FOUND, message);
			}
		}

		public static final class UPDATE_FAILED extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public UPDATE_FAILED(String message) {
				super(1007, HttpStatus.SC_NOT_FOUND, message);
			}
		}

		public static final class COUNT_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public COUNT_NOT_FOUND(String message) {
				super(1008, HttpStatus.SC_NOT_FOUND, message);
			}
		}

		public static final class NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public NOT_FOUND(String message) {
				super(1009, HttpStatus.SC_NOT_FOUND, message);
			}
		}

		public static final class DELETE_FAILED extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public DELETE_FAILED(String message) {
				super(1010, HttpStatus.SC_NOT_FOUND, message);
			}
		}

		/**
		 * /** Role Exceptions : The Error codes can be used to handle in App or website
		 * Role Error code range - 5040 to 5050
		 */
		public static final class ROLE_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public ROLE_NOT_FOUND(String id) {
				super(5041, HttpStatus.SC_NOT_FOUND, String.format("No role info available for { " + id + " }"));
			}
		}

		/**
		 * Password Exceptions : The Error codes can be used to handle in App or website
		 * Profile Error code range - 2001 to 2015
		 */
		public static final class PASSWORD_PATTERN_NOT_MATCHED extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public PASSWORD_PATTERN_NOT_MATCHED() {
				super(2001, HttpStatus.SC_NOT_FOUND, String.format(
						"Password does Not Match, Password Pattern Should Minimum eight characters, at least one uppercase letter, one lowercase letter,one number and one sepcial Symbol"));
			}
		}

		public static final class PASSWORD_MISMATCH extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public PASSWORD_MISMATCH() {
				super(2002, HttpStatus.SC_NOT_FOUND, String.format("Please make sure your passwords match"));
			}
		}

		public static final class OLD_PASSWORD__MISMATCH extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public OLD_PASSWORD__MISMATCH() {
				super(2003, HttpStatus.SC_NOT_FOUND, String.format("Invalid Old Password"));
			}
		}

		public static final class PASSWORD_NOT_UPDATED extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public PASSWORD_NOT_UPDATED() {
				super(2004, HttpStatus.SC_NOT_FOUND, String.format("Unable to update password"));
			}
		}

		public static final class OLD_PASSWORD_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public OLD_PASSWORD_NOT_FOUND() {
				super(2005, HttpStatus.SC_NOT_FOUND, String.format("Please enter old password"));
			}
		}

		public static final class PROFILE_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public PROFILE_NOT_FOUND(long id) {
				super(2007, HttpStatus.SC_NOT_FOUND, String.format("No Profile info available for { " + id + " }"));
			}

			public PROFILE_NOT_FOUND() {
				super(2008, HttpStatus.SC_NOT_FOUND, String.format("Profile Details Not found"));
			}
		}

		public static final class USER_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public USER_NOT_FOUND(long id) {
				super(2009, HttpStatus.SC_NOT_FOUND, String.format("No User info available for { " + id + " }"));
			}

			public USER_NOT_FOUND() {
				super(2010, HttpStatus.SC_NOT_FOUND, String.format("User Details Not found"));
			}
		}

		/**
		 * Profile Exceptions : The Error codes can be used to handle in App or website
		 * Profile Error code range - 5001 to 5010
		 */

		public static final class FIRSTNAME_PATTERN_NOT_MATCH extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public FIRSTNAME_PATTERN_NOT_MATCH() {
				super(5001, HttpStatus.SC_NOT_FOUND, String.format("Please specify a Valid First name"));
			}
		}

		public static final class EMAILID_PATTERN_NOT_MATCH extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public EMAILID_PATTERN_NOT_MATCH() {
				super(5002, HttpStatus.SC_NOT_FOUND, String.format("Please specify a Valid EmailId"));
			}
		}

		public static final class PAN_NUMBER_ALREADY_EXIST extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public PAN_NUMBER_ALREADY_EXIST() {
				super(5003, HttpStatus.SC_NOT_FOUND, String.format("User already exist with PanNumber"));
			}
		}

		public static final class ACCOUNT_NUMBER_ALREADY_EXIST extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public ACCOUNT_NUMBER_ALREADY_EXIST() {
				super(5004, HttpStatus.SC_NOT_FOUND, String.format("User already exist with Account Number"));
			}
		}

		public static final class AADHAR_NUMBER_ALREADY_EXIST extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public AADHAR_NUMBER_ALREADY_EXIST() {
				super(5005, HttpStatus.SC_NOT_FOUND, String.format("User already exist with aadhar Number"));
			}
		}

		public static final class GST_NUMBER_ALREADY_EXIST extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public GST_NUMBER_ALREADY_EXIST() {
				super(5006, HttpStatus.SC_NOT_FOUND, String.format("User already exist with GstNumber"));
			}
		}

		public static final class USER_ALREADY_EXIST extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public USER_ALREADY_EXIST() {
				super(5007, HttpStatus.SC_NOT_FOUND, String.format("User already exist with mobile number or email"));
			}

			public USER_ALREADY_EXIST(long phoneNumber) {
				super(5008, HttpStatus.SC_NOT_FOUND, String.format("User already exist with mobile number", phoneNumber));
			}

			public USER_ALREADY_EXIST(long phoneNumber, boolean status) {
				super(5009, HttpStatus.SC_NOT_FOUND, String.format(
						"User already exist with mobile number,But account is inactive. Please contact Let", phoneNumber));
			}
		}

		public static final class AADHAR_ALREADY_EXIST extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public AADHAR_ALREADY_EXIST() {
				super(5010, HttpStatus.SC_NOT_FOUND, String.format("User already exist with the Aadhar Number"));
			}
		}

		public static final class VALIDATE extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public VALIDATE(String message) {
				super(5011, HttpStatus.SC_NOT_FOUND, message);
			}
		}

		/**
		 * Profile Exceptions : The Error codes can be used to handle in App or website
		 * Profile Error code range - 5012 to 5030
		 */

		public static final class COUNTRY_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public COUNTRY_NOT_FOUND(long id) {
				super(5012, HttpStatus.SC_NOT_FOUND, String.format("No Country info available for { " + id + " }"));
			}

			public COUNTRY_NOT_FOUND() {
				super(5013, HttpStatus.SC_NOT_FOUND, String.format("Country not found"));
			}
		}

		public static final class CITY_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public CITY_NOT_FOUND(long id) {
				super(5014, HttpStatus.SC_NOT_FOUND, String.format("No city info available for { " + id + " }"));
			}

			public CITY_NOT_FOUND() {
				super(5015, HttpStatus.SC_NOT_FOUND, String.format("City not found"));
			}
		}

		public static final class STATE_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public STATE_NOT_FOUND(long id) {
				super(5016, HttpStatus.SC_NOT_FOUND, String.format("No state info available for { " + id + " }"));
			}
		}

		public static final class BANK_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public BANK_NOT_FOUND(long id) {
				super(5017, HttpStatus.SC_NOT_FOUND, String.format("No Bank info available for { " + id + " }"));
			}

			public BANK_NOT_FOUND() {
				super(5018, HttpStatus.SC_NOT_FOUND, String.format("Bank not found"));
			}
		}

		public static final class PAN_PATTERN_NOT_MATCH extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public PAN_PATTERN_NOT_MATCH() {
				super(5019, HttpStatus.SC_NOT_FOUND, String.format("Please specify a Valid Pan number"));
			}
		}

		public static final class MEMBER_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public MEMBER_NOT_FOUND(long id) {
				super(5020, HttpStatus.SC_NOT_FOUND, String.format("No Member info available for { " + id + " }"));
			}

			public MEMBER_NOT_FOUND() {
				super(5021, HttpStatus.SC_NOT_FOUND, String.format("Member not found"));
			}
		}

		public static final class ADDRESS_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public ADDRESS_NOT_FOUND(long id) {
				super(5022, HttpStatus.SC_NOT_FOUND, String.format("No Address info available for { " + id + " }"));
			}

			public ADDRESS_NOT_FOUND() {
				super(5023, HttpStatus.SC_NOT_FOUND, String.format("Address not found"));
			}
		}

		public static final class RETAILER_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public RETAILER_NOT_FOUND(long id) {
				super(5024, HttpStatus.SC_NOT_FOUND, String.format("No Retailer info available for { " + id + " }"));
			}

			public RETAILER_NOT_FOUND() {
				super(5025, HttpStatus.SC_NOT_FOUND, String.format("Retailer not found"));
			}
		}

		public static final class COLLECTION_CENTER_NOT_FOUND extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public COLLECTION_CENTER_NOT_FOUND(long id) {
				super(5026, HttpStatus.SC_NOT_FOUND,
						String.format("No Collection Center info available for { " + id + " }"));
			}

			public COLLECTION_CENTER_NOT_FOUND() {
				super(5027, HttpStatus.SC_NOT_FOUND, String.format("Collection Center not found"));
			}

			public COLLECTION_CENTER_NOT_FOUND(String id) {
				super(5028, HttpStatus.SC_NOT_FOUND,
						String.format("No Collection Center info available for { " + id + " }"));
			}
		}
		

		public static final class LICENSE_NUMBER_ALREADY_EXIST extends IMonRestException {
			private static final long serialVersionUID = 1L;

			public LICENSE_NUMBER_ALREADY_EXIST() {
				super(5029, HttpStatus.SC_NOT_FOUND, String.format("User already exist with Licence Number"));
			}
		}

		public static final class WAREHOUSE_NOT_FOUND extends IMonRestException {
			
			private static final long serialVersionUID = 1L;

			public WAREHOUSE_NOT_FOUND(long id) {
				super(5026, HttpStatus.SC_NOT_FOUND,
						String.format("No WAREHOUSE  info available for { " + id + " }"));
			}

			public WAREHOUSE_NOT_FOUND() {
				super(5027, HttpStatus.SC_NOT_FOUND, String.format("WAREHOUSE  not found"));
			}

			public WAREHOUSE_NOT_FOUND(String id) {
				super(5028, HttpStatus.SC_NOT_FOUND,
						String.format("No WAREHOUSE info available for { " + id + " }"));
			}
		}
		
	}


	


