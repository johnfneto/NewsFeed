package com.appsolve.johnneto.newsfeed.models;

/**
 * Created by johnneto on 12/04/16.
 */

import java.util.ArrayList;
import java.util.List;

public class Feeds {

    private ResponseData responseData;
    private Object responseDetails;
    private Integer responseStatus;

    public ResponseData getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }

    public Object getResponseDetails() {
        return responseDetails;
    }

    public void setResponseDetails(Object responseDetails) {
        this.responseDetails = responseDetails;
    }

    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    public class ResponseData {

        private Feed feed;

        public Feed getFeed() {
            return feed;
        }

        public void setFeed(Feed feed) {
            this.feed = feed;
        }

        public class Feed {

            private String feedUrl;
            private String title;
            private String link;
            private String author;
            private String description;
            private String type;
            private List<Entry> entries = new ArrayList<Entry>();

            public String getFeedUrl() {
                return feedUrl;
            }

            public void setFeedUrl(String feedUrl) {
                this.feedUrl = feedUrl;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<Entry> getEntries() {
                return entries;
            }

            public void setEntries(List<Entry> entries) {
                this.entries = entries;
            }


            public class Entry {

                private String title;
                private String link;
                private String author;
                private String publishedDate;
                private String contentSnippet;
                private String content;
                private List<String> categories = new ArrayList<String>();

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }

                public String getPublishedDate() {
                    return publishedDate;
                }

                public void setPublishedDate(String publishedDate) {
                    this.publishedDate = publishedDate;
                }

                public String getContentSnippet() {
                    return contentSnippet;
                }

                public void setContentSnippet(String contentSnippet) {
                    this.contentSnippet = contentSnippet;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public List<String> getCategories() {
                    return categories;
                }

                public void setCategories(List<String> categories) {
                    this.categories = categories;
                }
            }

        }

    }
}
