package cn.toma.planmodel.handler;

/**
 * @Author: zqx
 * @Date: 2019-08-06 15:39
 * @Description:
 */
public abstract class Handler
{

	private Handler nextHandler;

	public final Response handleRequest(Request request)
	{
		Response response = null;
		if (this.getHandlerLevel().above(request.getLevel())) {
			response = this.response(request);
		}
		else {
			if (this.nextHandler != null) {
				this.nextHandler.handleRequest(request);
			}
			else {
				System.out.println("not handler....");
			}
		}
		return response;
	}

	public void setNextHandler(Handler handler)
	{
		this.nextHandler = handler;
	}

	protected abstract Level getHandlerLevel();

	public abstract Response response(Request request);

}
