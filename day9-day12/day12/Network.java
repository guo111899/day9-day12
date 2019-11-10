
public class Network extends Maintainer{
	public Network() {
		super();
	}
	//有参数构造方法
	public Network(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在检查网络是否畅通");
	}
}