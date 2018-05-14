package librarydemo.db.com.logutilities;

import android.support.compat.BuildConfig;
import android.util.Log;

/**
 * Helper methods that make logging more consistent throughout the app.
 */
public class LogUtils {
    public static final boolean FORCE_DEBUG = false;
    private static final String LOG_PREFIX = "dashclock_";
    private static final int LOG_PREFIX_LENGTH = LOG_PREFIX.length();
    private static final int MAX_LOG_TAG_LENGTH = 23;
    private static final String TAG = makeLogTag(LogUtils.class);

    private LogUtils() {
    }

    /**
     * WARNING: Don't use this when obfuscating class names with Proguard!
     * Checks whether a "TAG" is valid or not
     *
     * @param cls  the Class containing Log methods
     * @return the name of the Class
     */
    public static String makeLogTag(Class cls) {
        return makeLogTag(cls.getSimpleName());
    }

    /**
     * Checks whether a "TAG" is valid or not
     *
     * @param str  the "TAG" that you want to be validated
     * @return the LOG_PREFIX and TAG values
     */
    public static String makeLogTag(String str) {
        if (str.length() > MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH) {
            return LOG_PREFIX + str.substring(0, MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH - 1);
        }
        String abc = LOG_PREFIX +str ;
        return abc;

    }

    /**
     * Display a DEBUG log message
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     */
    public static void LOGD(final String tag, String message) {
        if (tag.length() > 22) {
            return;
        }
        //noinspection PointlessBooleanExpression,ConstantConditions
        if (FORCE_DEBUG || BuildConfig.DEBUG || Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, message);
        }
    }

    /**
     * Display a DEBUG log message and log the exception.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     * @param cause   An exception to log
     */
    public static void LOGD(final String tag, String message, Throwable cause) {
        if (tag.length() > 22) {
            return;
        }
        //noinspection PointlessBooleanExpression,ConstantConditions
        if (FORCE_DEBUG || BuildConfig.DEBUG || Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, message, cause);
        }
    }

    /**
     * Displays a VERBOSE log message.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     */
    public static void LOGV(final String tag, String message) {
        //noinspection PointlessBooleanExpression,ConstantConditions
        if ((FORCE_DEBUG || BuildConfig.DEBUG) && Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, message);
        }
    }

    /**
     * Displays a VERBOSE log message and log the exception.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     * @param cause   An exception to log
     */
    public static void LOGV(final String tag, String message, Throwable cause) {
        //noinspection PointlessBooleanExpression,ConstantConditions
        if ((FORCE_DEBUG || BuildConfig.DEBUG) && Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, message, cause);
        }
    }

    /**
     * Displays an INFO log message.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     */
    public static void LOGI(final String tag, String message) {
        Log.i(tag, message);
    }


    /**
     * Displays an INFO log message and log the exception.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     * @param cause   An exception to log
     */
    public static void LOGI(final String tag, String message, Throwable cause) {
        Log.i(tag, message, cause);
    }

    /**
     * Displays a WARN log message.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     */
    public static void LOGW(final String tag, String message) {
        Log.w(tag, message);
    }

    /**
     * Displays a WARN log message and log the exception.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     * @param cause   An exception to log
     */
    public static void LOGW(final String tag, String message, Throwable cause) {
        Log.w(tag, message, cause);
    }

    /**
     * Displays an ERROR log message.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     */
    public static void LOGE(final String tag, String message) {

        if (tag.length() > 22) {
            return;
        }
        Log.e(tag, message);
    }

    /**
     * Displays an ERROR log message and log the exception.
     *
     * @param tag     Used to identify the source of a log message.
     * @param message The message you would like logged.
     * @param cause   An exception to log
     */
    public static void LOGE(final String tag, String message, Throwable cause) {
        if (tag.length() > 22) {
            return;
        }
        Log.e(tag, message, cause);
    }
}