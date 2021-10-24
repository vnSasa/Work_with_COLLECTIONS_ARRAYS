package ua.yaremechko.CollectionArray.FillObject;

public class Car {
	private int horsePower;
	private int yearStart;

	public Car(int horsePower, int yearStart) {
		super();
		this.horsePower = horsePower;
		this.yearStart = yearStart;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getYearStart() {
		return yearStart;
	}

	public void setYearStart(int yearStart) {
		this.yearStart = yearStart;
	}

	@Override
	public String toString() {
		return "Car [horsePower=" + horsePower + ", yearStart=" + yearStart + "]";
	}
}
