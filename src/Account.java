public class Account {
	private String email;
	private boolean permission = true;

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setPermission(boolean permission) {
		this.permission = permission;
	}

	public boolean getPermission() {
		return this.permission;
	}
}
