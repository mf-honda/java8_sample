package sample;

import sample.exception.SampleExceptionHandleImpl;
import sample.exception.SampleExceptionHandleInterface;

/**
 * SampleMain
 *
 */
public class SampleMain {

	/**
	 * 利用者
	 */
	public static void main(String[] args) {

		try {
			int i = 1 / 0;

		} catch (Exception exception) {

			// 例外処理インタフェースを利用する
			SampleExceptionHandleInterface exceptionHandler = new SampleExceptionHandleImpl();

			// 例外処理インタフェースに、発生した例外をパラメータとして連携する
			exceptionHandler.handleException(exception);

		}
	}
}
