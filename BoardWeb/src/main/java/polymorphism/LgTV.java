package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component : 해당 클래스에 기본 생성자가 있어야 함. 또 컨테이너가 생성한 객체를 요청하려면 사용할 아이디나 이름이 반드시 있어야함.
// name이나 id가 없을 시 클래스 이름의 첫글자를 소문자로 하는 카멜케이스로 이름이 자동으로 생성된다.
@Component("tv")
public class LgTV implements TV {
	
	@Autowired
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
