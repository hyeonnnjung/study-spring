package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //인터페이스와 구현체 둘 다에 의존하고 있음
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
