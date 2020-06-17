package sample.exception;

/**
 * 「例外処理機能」が公開する例外処理インタフェース
 */
public interface SampleExceptionHandleInterface {

	/**
	 * 例外処理メソッド
	 *
	 * @param exception 発生例外
	 */
	void handleException(Exception exception);
}
