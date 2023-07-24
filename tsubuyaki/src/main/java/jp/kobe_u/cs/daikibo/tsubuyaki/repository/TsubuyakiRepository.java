package jp.kobe_u.cs.daikibo.tsubuyaki.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.kobe_u.cs.daikibo.tsubuyaki.entity.Tsubuyaki;

import java.util.List;

@Repository  
public interface TsubuyakiRepository extends CrudRepository<Tsubuyaki, Long>{
    // コメントの部分一致検索（大文字小文字を区別しない）
    List<Tsubuyaki> findByCommentContainingIgnoreCase(String keyword);
}