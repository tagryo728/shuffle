package com.example.song;

import java.util.ArrayList;
import java.util.List;

public interface ShuffleEngine {

    public static final Integer PEEK_MAX = 5;

    
    void setSongs(Song[] songs);

    Song getNextSong();

    Song[] peekQueue();
}

/**
 * インターフェイスの実装
  */
class InnerShuffleEngine  implements ShuffleEngine{


    // シャッフル対象の曲(Song)の配列をインスタンスに設定
    public void setSongs() {

        List<Song> list = new ArrayList<Song>();

    }

    // 次に再生する曲(Song)を返します。
    // 次に返す曲が更新されます。
    public Song getNextSong() {

        return null;

    }

    // 次に再生する予定の曲を先読みして、PEEK_MAXの長さの配列として返します。
    // 次に返す曲の状態は変わりません。
    public Song[] peekQueue() {

        return null;

    }

    @Override
    public void setSongs(Song[] songs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSongs'");
    }

    

    
}
