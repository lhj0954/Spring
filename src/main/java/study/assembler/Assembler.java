package study.assembler;

import study.spring.ChangePasswordService;
import study.spring.MemberDao;
import study.spring.MemberRegisterService;

public class Assembler {

    private MemberDao  memberDao;
    private MemberRegisterService regSvc;
    private ChangePasswordService pwdSvc;

    public Assembler() {
        memberDao = new MemberDao();
        regSvc = new MemberRegisterService(memberDao); //생성자를 통해 MemberDao 객체 주입
        pwdSvc = new ChangePasswordService(); // 세터를 통해 주입
        pwdSvc.setMemberDao(memberDao);
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public MemberRegisterService getMemberRegisterService() {
        return regSvc;
    }

    public ChangePasswordService getChangePasswordService() {
       return pwdSvc;
    }
}
