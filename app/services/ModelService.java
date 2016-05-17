package services;

import java.util.Optional;

import com.avaje.ebean.Model;

/*
 * DBアクセス用インターフェース
 *
 */
public interface ModelService<T extends Model> {

    // 対象のモデルインスタンスを保存
    public Optional<T> save(T entry);

}