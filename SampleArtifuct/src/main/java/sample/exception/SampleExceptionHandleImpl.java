package sample.exception;

/**
 * 「例外処理機能」が公開する例外処理インタフェースの処理実装
 */
public class SampleExceptionHandleImpl
		implements SampleExceptionHandleInterface {

	@Override
	public void handleException(Exception exception) {
		// 「ログ出力」を行う
		System.out.println(this.getClass());
		System.out.println(exception.getMessage());
	}
}
