package com.techacademy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Lombokのアノテーション
@Data
//getter/setter、toString、hashCode、equals」のメソッドを生成

@AllArgsConstructor
//すべてのフィールドを引数に持つコンストラクタを生成

@NoArgsConstructor
//引数を持たないコンストラクタを生成


//Spring JPAのアノテーション
@Entity
//エンティティクラス（データベースのテーブルにマッピングするクラス）であることを示します

@Table(name="country")
//対応するテーブル名を指定
public class Country {
    @Id
    //主キーであることを示します
    private String code;
    private String name;
    private int population;

}