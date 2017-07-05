package com.contentful.java.cma;

import com.contentful.java.cma.model.CMAArray;
import com.contentful.java.cma.model.CMASpaceMembership;

import java.util.Map;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Service class to define the REST interface to Contentful.
 */
public interface ServiceSpaceMemberships {
  @GET("/spaces/{spaceId}/space_memberships/")
  Observable<CMAArray<CMASpaceMembership>> fetchAll(@Path("spaceId") String spaceId);

  @GET("/spaces/{spaceId}/space_memberships")
  Observable<CMAArray<CMASpaceMembership>> fetchAll(
      @Path("spaceId") String spaceId,
      @QueryMap Map<String, String> query
  );

  @GET("/spaces/{spaceId}/space_memberships/{membershipId}")
  Observable<CMASpaceMembership> fetchOne(
      @Path("spaceId") String spaceId,
      @Path("membershipId") String membershipId
  );

  @POST("/spaces/{spaceId}/space_memberships/")
  Observable<CMASpaceMembership> create(
      @Path("spaceId") String spaceId,
      @Body CMASpaceMembership membership
  );

  @PUT("/spaces/{spaceId}/space_memberships/{membershipId}")
  Observable<CMASpaceMembership> update(
      @Path("spaceId") String spaceId,
      @Path("membershipId") String membershipId,
      @Body CMASpaceMembership membership,
      @Header("X-Contentful-Version") Integer version
  );

  @DELETE("/spaces/{spaceId}/space_memberships/{membershipId}")
  Observable<Response<Void>> delete(
      @Path("spaceId") String spaceId,
      @Path("membershipId") String membershipId
  );
}
