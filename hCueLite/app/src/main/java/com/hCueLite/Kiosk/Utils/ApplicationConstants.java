package com.hCueLite.Kiosk.Utils;



/**
 * Created by cvluser on 27-07-2015.
 */
public class ApplicationConstants {
    //Rest client configuration constants
    public static final int CONNECTION_TIME_OUT = 15000;
    public static final int READ_TIME_OUT = 15000;
    public static final int WRITE_TIME_OUT = 15000;

    //App constants
    public static final int TAKE_PHOTO_REQUEST = 1001;
    public static final int PICK_PHOTO_REQUEST = 1002;
    public static final int TAKE_PHOTO_RESULT = 1003;
    public static final int PICK_PHOTO_RESULT = 1004;
    //Dialog fragments constants
    public static final int BUTTON_OK = 1;
    public static final int BUTTON_TRY_AGAIN = 2;
    public static final int BUTTON_PROCEED = 3;
    public static final int BUTTON_CANCEL = 4;
    public static final int OPERATION_FAILED = 5;

   /* public static int getActionTitle(int action) {
        switch (action) {
            case BUTTON_OK:
                return R.string.dialog_action_ok;
            case BUTTON_TRY_AGAIN:
                return R.string.dialog_action_try_again;
            case BUTTON_PROCEED:
                return R.string.dialog_action_proceed;
            case BUTTON_CANCEL:
                return R.string.dialog_action_cancel;
            case OPERATION_FAILED:
                return R.string.dialog_action_ok;
            default:
                return R.string.dialog_action_ok;
        }
    }*/

    public static int MAX_CHAT_ITEMS = 10;

    private static String currentChatEUJID;

    public static String getCurrentChatEUJID()
    {
        return currentChatEUJID;
    }

    public static void setCurrentChatEUJID(String currentChatEUJIDO)
    {
        currentChatEUJID = currentChatEUJIDO;
    }

    public static boolean isInHomeScreen = false;
    public static boolean isInTasksScreen = false;
}
