package com.contentful.java.cma.model;

import com.google.gson.annotations.SerializedName;

/**
 * Class representing api keys created.
 */
public class CMAApiKey extends CMAResource {
  private String name;
  private String description;

  private String accessToken;
  @SerializedName("preview_api_key")
  private CMALink previewApiKey;

  /**
   * Create a new api key.
   */
  public CMAApiKey() {
    super(CMAType.ApiKey);
  }

  /**
   * @return What is the name of this key?
   */
  public String getName() {
    return name;
  }

  /**
   * Update the name of the key.
   *
   * @param name new name to be used.
   * @return this instance for ease of chaining.
   */
  public CMAApiKey setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * @return the description of this key.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Update the description of this key.
   *
   * @param description to be changed to.
   * @return this instance for chaining.
   */
  public CMAApiKey setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * @return readonly api access token for this key.
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * @return readonly preview api key part.
   */
  public CMALink getPreviewApiKey() {
    return previewApiKey;
  }


  /**
   * @return a human readable string, representing the object.
   */
  @Override public String toString() {
    return "CMAApiKey { " + super.toString() + " "
        + "accessToken = " + getAccessToken() + ", "
        + "description = " + getDescription() + ", "
        + "name = " + getName() + ", "
        + "previewApiKey = " + getPreviewApiKey() + " "
        + "}";
  }
}
