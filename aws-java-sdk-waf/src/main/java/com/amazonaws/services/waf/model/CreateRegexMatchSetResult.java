/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRegexMatchSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRegexMatchSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code> objects.
     * </p>
     */
    private RegexMatchSet regexMatchSet;
    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the <code>CreateRegexMatchSet</code> request. You can also
     * use this value to query the status of the request. For more information, see <a>GetChangeTokenStatus</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code> objects.
     * </p>
     * 
     * @param regexMatchSet
     *        A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code> objects.
     */

    public void setRegexMatchSet(RegexMatchSet regexMatchSet) {
        this.regexMatchSet = regexMatchSet;
    }

    /**
     * <p>
     * A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code> objects.
     * </p>
     * 
     * @return A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code> objects.
     */

    public RegexMatchSet getRegexMatchSet() {
        return this.regexMatchSet;
    }

    /**
     * <p>
     * A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code> objects.
     * </p>
     * 
     * @param regexMatchSet
     *        A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegexMatchSetResult withRegexMatchSet(RegexMatchSet regexMatchSet) {
        setRegexMatchSet(regexMatchSet);
        return this;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the <code>CreateRegexMatchSet</code> request. You can also
     * use this value to query the status of the request. For more information, see <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @param changeToken
     *        The <code>ChangeToken</code> that you used to submit the <code>CreateRegexMatchSet</code> request. You can
     *        also use this value to query the status of the request. For more information, see
     *        <a>GetChangeTokenStatus</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the <code>CreateRegexMatchSet</code> request. You can also
     * use this value to query the status of the request. For more information, see <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @return The <code>ChangeToken</code> that you used to submit the <code>CreateRegexMatchSet</code> request. You
     *         can also use this value to query the status of the request. For more information, see
     *         <a>GetChangeTokenStatus</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the <code>CreateRegexMatchSet</code> request. You can also
     * use this value to query the status of the request. For more information, see <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @param changeToken
     *        The <code>ChangeToken</code> that you used to submit the <code>CreateRegexMatchSet</code> request. You can
     *        also use this value to query the status of the request. For more information, see
     *        <a>GetChangeTokenStatus</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegexMatchSetResult withChangeToken(String changeToken) {
        setChangeToken(changeToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegexMatchSet() != null)
            sb.append("RegexMatchSet: ").append(getRegexMatchSet()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRegexMatchSetResult == false)
            return false;
        CreateRegexMatchSetResult other = (CreateRegexMatchSetResult) obj;
        if (other.getRegexMatchSet() == null ^ this.getRegexMatchSet() == null)
            return false;
        if (other.getRegexMatchSet() != null && other.getRegexMatchSet().equals(this.getRegexMatchSet()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegexMatchSet() == null) ? 0 : getRegexMatchSet().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateRegexMatchSetResult clone() {
        try {
            return (CreateRegexMatchSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
