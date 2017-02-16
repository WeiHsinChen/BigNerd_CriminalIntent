package criminalintent.android.bignerdranch.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by frank on 2/14/17.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mIsSolved;

    public UUID getId() {
        return mId;
    }

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public void setSolved(boolean solved) {
        mIsSolved = solved;
    }

    public void setDate(Date date) {

        mDate = date;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {

        return mIsSolved;
    }

    public Date getDate() {
        return mDate;
    }

    public String getTitle() {
        return mTitle;
    }

}
