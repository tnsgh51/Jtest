package testCode;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainSrc.Member;

public class TestMember {
	// 독림된 단위 테스트를 지원해 주는 프레임워크
	// 사용되는 어노테이션
	// @Test > @Test가 선언된 메서드가 테스트를 수행한다.
	// @Before > @Test가 선언된 메서드가 실행되기 전에 수행
	// @Ignore > 테스트를 실행하지 않는다.

	// sysout 으로는 콘솔에 결과를 출력하지만.
	// assert(단정메서드)로 테스트의 결과를 판별
	// Ex) asserEquals(예상값, 실제값)
	// 위의 단정 메서드는 예상값과 실제값이 일치하면 성공,
	// 일치 하지 않으면 실패
	
	//JUnit 메서드
	//assertEquals(a,b); -- 객체 또는 값이 일치?
	//assertSame(a,b);  -- 배열의 값이 일치?
	//assertArrayEquals(a,b); --같은 객체?
	//assertTrue(a);  --조건이 참?
	//assertNotNull(a);  --객체가 null이 아닌가?
	//assertNull(a);  --객체가 null?
	
	Member newMember;
	Member oldMember;

	@Test
	public void test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember, oldMember);
		if(newMember == null) {
			System.out.println("ok");
		}
		assertTrue(newMember==null);
	}
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = newMember;
		
	}
}
