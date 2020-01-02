package Help;

public class Data  implements java.io.Serializable
{
	private String url;
	private String method;
	private String data;
	public Data()
	{}
	public Data(String url,String method,String data)
	{
		this.url=url;
		this.method=method;
		this.data=data;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	

}
