package question_3;

public class SonyTv {
	@Override
	public void home() {
		System.out.println("SonyTv: Home Button...");
	}

	@Override
	public void volume() {
		System.out.println("SonyTv: Volume Changed...");
	}

	@Override
	public void changeChannels() {
		System.out.println("SonyTv: Channels changed");
	}

	@Override
	public void keyInputs() {
		System.out.println("SonyTv: Keys pressed");
	}

}
