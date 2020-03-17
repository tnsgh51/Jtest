package testCode;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainSrc.Member;

public class TestMember {
	// ������ ���� �׽�Ʈ�� ������ �ִ� �����ӿ�ũ
	// ���Ǵ� ������̼�
	// @Test > @Test�� ����� �޼��尡 �׽�Ʈ�� �����Ѵ�.
	// @Before > @Test�� ����� �޼��尡 ����Ǳ� ���� ����
	// @Ignore > �׽�Ʈ�� �������� �ʴ´�.

	// sysout ���δ� �ֿܼ� ����� ���������.
	// assert(�����޼���)�� �׽�Ʈ�� ����� �Ǻ�
	// Ex) asserEquals(����, ������)
	// ���� ���� �޼���� ���󰪰� �������� ��ġ�ϸ� ����,
	// ��ġ ���� ������ ����
	
	//JUnit �޼���
	//assertEquals(a,b); -- ��ü �Ǵ� ���� ��ġ?
	//assertSame(a,b);  -- �迭�� ���� ��ġ?
	//assertArrayEquals(a,b); --���� ��ü?
	//assertTrue(a);  --������ ��?
	//assertNotNull(a);  --��ü�� null�� �ƴѰ�?
	//assertNull(a);  --��ü�� null?
	
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
