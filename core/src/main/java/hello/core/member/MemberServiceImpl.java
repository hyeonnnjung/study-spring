package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //인터페이스와 구현체 둘 다에 의존하고 있음 -> DIP를 지키도록 변경!
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
