/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  javax.servlet.jsp.tagext.TagData
 *  javax.servlet.jsp.tagext.TagExtraInfo
 *  javax.servlet.jsp.tagext.VariableInfo
 */
package javax.help.tagext;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;

public class SearchTOCItemTEI
extends TagExtraInfo {
    public VariableInfo[] getVariableInfo(TagData tagData) {
        return new VariableInfo[]{new VariableInfo("name", "java.lang.String", true, 0), new VariableInfo("helpID", "java.lang.String", true, 0), new VariableInfo("confidence", "java.lang.String", true, 0), new VariableInfo("hits", "java.lang.String", true, 0), new VariableInfo("contentURL", "java.lang.String", true, 0), new VariableInfo("hitBoundries", "java.lang.String", true, 0)};
    }
}
