package study.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {

    private static long nextId=0;

    private Map<String, Member> map = new HashMap<>();

    public Member selectByEmail(String email) {
        return map.get(email); //email을 통해서 Member객체 리턴
    }

    public void insert(Member member) {
        member.setId(++nextId); //회원추가할 때마다 id 1씩 증가
        map.put(member.getEmail(), member); //회원추가 시 키 값을 email로 member객체 리턴하도록 추가
    }

    public void update(Member member) {
        map.put(member.getEmail(), member);
    }

    public Collection<Member> selectAll() {
        return map.values();
    }
}
