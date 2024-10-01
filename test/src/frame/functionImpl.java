package frame;

public class functionImpl implements Function {
	CustomerDAO dao = new CustomerDAO();
	@Override
	public CustomerDTO passInfo(String name) {
		CustomerDTO dto = dao.selectCustomer(name);
		
		return dto;
	}

}
