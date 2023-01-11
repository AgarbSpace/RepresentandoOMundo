public class User {
	private String name;
	private boolean signature = false;
	private School school;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSignature(boolean signature) {
		this.signature = signature;
	}

	public boolean getSignature() {
		return this.signature;
	}

	public School getSchool() {
		return this.school;
	}

}
