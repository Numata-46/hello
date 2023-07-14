package jp.kobe_u.cs.daikibo.tsubuyaki.entity;

import lombok.Data;
import javax.persistence.Entity;
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Entity
public class Tsubuyaki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; //つぶやきエンティティの識別子
    String name;    //名前
    String comment; //コメント
    @Temporal(TemporalType.TIMESTAMP)
    Date createdAt; //作成日時
}