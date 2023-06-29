import java.util.HashMap;
import java.util.Map;

public class Recorder {
    private Map<String, String> map = new HashMap<>();

    public void put(String key, String value){
        //キーとバリューの組み合わせを登録
        map.put(key,value);

        //標準出力[key]=[value]
        System.out.println(key + "=" + value);
    }

    public void get(String key){
        //キーが未登録
        if (!map.containsKey(key)) {
			throw new IllegalArgumentException();
		}

        //キーが登録済み：対応するバリューを標準出力
        System.out.println(map.get(key));
    }

    public void delete(String key) {
        //キーが未登録
        if (!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }

        //キーが登録済みの場合：対応するキーとバリューの組み合わせを削除
        map.remove(key);
		System.out.println("deleted: "  + key);

    }

    public void delete() {
        //引数がなかった場合：全てのキーとバリューの値を削除
        map.clear();
		System.out.println("deleted all");

    }
}