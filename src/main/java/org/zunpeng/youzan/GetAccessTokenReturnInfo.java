package org.zunpeng.youzan;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dapeng on 2017/2/9.
 */
public class GetAccessTokenReturnInfo extends AuthErrorBean {

	@SerializedName("access_token")
	private String accessToken;

	@SerializedName("expires_in")
	private long expiresIn;

	@SerializedName("token_type")
	private String tokenType;

	private String scope;

	@SerializedName("refresh_token")
	private String refreshToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
}
