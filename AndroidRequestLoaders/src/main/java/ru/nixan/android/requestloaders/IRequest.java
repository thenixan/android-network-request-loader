package ru.nixan.android.requestloaders;

import android.content.Context;

/**
 * Created by nixan on 11/26/13.
 */
public interface IRequest {

    /**
     * Executes the request.
     */
    public void execute(Context context);

    /**
     * Cancel the executing request
     */
    public void cancel();

    /**
     * @return if the instance of this request class have already been executed
     */
    public boolean wasExecuted();

    /**
     * Set the result of the request
     */
    public void setException(Exception exception);

    /**
     * @return the exception that occured during excecution.
     */
    public Exception getException();

    /**
     * @return if the request was succesfull
     */
    public boolean isSuccesfull();
}
