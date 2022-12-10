package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors (fluent = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headers{

	@JsonProperty("x-amzn-trace-id")
	private String xAmznTraceId;

	@JsonProperty("x-forwarded-proto")
	private String xForwardedProto;

	@JsonProperty("cookie")
	private String cookie;

	@JsonProperty("postman-token")
	private String postmanToken;

	@JsonProperty("host")
	private String host;

	@JsonProperty("x-forwarded-port")
	private String xForwardedPort;

	@JsonProperty("cache-control")
	private String cacheControl;

	@JsonProperty("accept-encoding")
	private String acceptEncoding;

	@JsonProperty("user-agent")
	private String userAgent;

	@JsonProperty("accept")
	private String accept;


}