package it.netgrid.search.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class SubContent {
public static final String PARENT_CONTENT_FIELD_NAME="sct_parent_content";
@ManyToOne
@JoinColumn(name="PARENT_CONTENT_FIELD_NAME")
private Content content;
}
