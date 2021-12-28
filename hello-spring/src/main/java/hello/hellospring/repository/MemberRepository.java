package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);  //찾았는데 없을때 null을 Optional로 감싸서 반환한다.
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
