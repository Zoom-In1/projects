package hair;

public class PetHairDTO {
	private int num;
	private String name;
	private String petName;
	private int kind;
	private int petGender;
	private String service;
	private String weight;
	private String day;
	private String time;

	public PetHairDTO() {
		
	}
	
	public PetHairDTO(int num, String name, String petName, int kind, int petGender, String service, String weight,String day, String time) {
		super();
		this.num = num;
		this.name = name;
		this.petName = petName;
		this.kind = kind;
		this.petGender = petGender;
		this.service = service;
		this.weight = weight;
		this.day = day;
		this.time = time;
	}

	
	
	@Override
	public String toString() {
		return "PetHairDTO [num=" + num + ", name=" + name + ", petName=" + petName + ", kind=" + kind + ", petGender="
				+ petGender + ", service=" + service + ", weight=" + weight + ", day=" + day + ", time=" + time + "]";
	}

	// getter & setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public int getPetGender() {
		return petGender;
	}

	public void setPetGender(int petGender) {
		this.petGender = petGender;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
