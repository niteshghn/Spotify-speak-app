package com.nitesh.spotifyspeech;

import java.util.List;

/**
 * Created by niteshverma on 28/04/17.
 */

class SearchResponse {


    /**
     * tracks : {"href":"https://api.spotify.com/v1/search?query=kuch+kuch+hota+hai&type=track&market=US&offset=0&limit=20","items":[{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"external_urls":{"spotify":"https://open.spotify.com/album/5i3NjuZceh9iqtcODFTM4Q"},"href":"https://api.spotify.com/v1/albums/5i3NjuZceh9iqtcODFTM4Q","id":"5i3NjuZceh9iqtcODFTM4Q","images":[{"height":640,"url":"https://i.scdn.co/image/f7974e7a42a30a43611e84903ff549d8e18f9111","width":640},{"height":300,"url":"https://i.scdn.co/image/af5aa0d1385c814eb0bbd9e62cf57c21d02c3b20","width":300},{"height":64,"url":"https://i.scdn.co/image/28a1a13d2cd07c332dbaa5a02aa4fda70b0814ac","width":64}],"name":"Kuch Kuch Hota Hai","type":"album","uri":"spotify:album:5i3NjuZceh9iqtcODFTM4Q"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"},{"external_urls":{"spotify":"https://open.spotify.com/artist/70B80Lwx2sxti0M1Ng9e8K"},"href":"https://api.spotify.com/v1/artists/70B80Lwx2sxti0M1Ng9e8K","id":"70B80Lwx2sxti0M1Ng9e8K","name":"Udit Narayan","type":"artist","uri":"spotify:artist:70B80Lwx2sxti0M1Ng9e8K"},{"external_urls":{"spotify":"https://open.spotify.com/artist/3gBKY0y3dFFVRqicLnVZYz"},"href":"https://api.spotify.com/v1/artists/3gBKY0y3dFFVRqicLnVZYz","id":"3gBKY0y3dFFVRqicLnVZYz","name":"Alka Yagnik","type":"artist","uri":"spotify:artist:3gBKY0y3dFFVRqicLnVZYz"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"disc_number":1,"duration_ms":297866,"explicit":false,"external_ids":{"isrc":"INS179900049"},"external_urls":{"spotify":"https://open.spotify.com/track/4RixtPhUXlci9ad4qIMj23"},"href":"https://api.spotify.com/v1/tracks/4RixtPhUXlci9ad4qIMj23","id":"4RixtPhUXlci9ad4qIMj23","name":"Kuch Kuch Hota Hai","popularity":45,"preview_url":"https://p.scdn.co/mp3-preview/838f04393c119b9b33bf432e6e5bbad16429024b?cid=8897482848704f2a8f8d7c79726a70d4","track_number":1,"type":"track","uri":"spotify:track:4RixtPhUXlci9ad4qIMj23"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"external_urls":{"spotify":"https://open.spotify.com/album/5i3NjuZceh9iqtcODFTM4Q"},"href":"https://api.spotify.com/v1/albums/5i3NjuZceh9iqtcODFTM4Q","id":"5i3NjuZceh9iqtcODFTM4Q","images":[{"height":640,"url":"https://i.scdn.co/image/f7974e7a42a30a43611e84903ff549d8e18f9111","width":640},{"height":300,"url":"https://i.scdn.co/image/af5aa0d1385c814eb0bbd9e62cf57c21d02c3b20","width":300},{"height":64,"url":"https://i.scdn.co/image/28a1a13d2cd07c332dbaa5a02aa4fda70b0814ac","width":64}],"name":"Kuch Kuch Hota Hai","type":"album","uri":"spotify:album:5i3NjuZceh9iqtcODFTM4Q"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4K6blSRoklNdpw4mzLxwfn"},"href":"https://api.spotify.com/v1/artists/4K6blSRoklNdpw4mzLxwfn","id":"4K6blSRoklNdpw4mzLxwfn","name":"Kumar Sanu","type":"artist","uri":"spotify:artist:4K6blSRoklNdpw4mzLxwfn"},{"external_urls":{"spotify":"https://open.spotify.com/artist/3gBKY0y3dFFVRqicLnVZYz"},"href":"https://api.spotify.com/v1/artists/3gBKY0y3dFFVRqicLnVZYz","id":"3gBKY0y3dFFVRqicLnVZYz","name":"Alka Yagnik","type":"artist","uri":"spotify:artist:3gBKY0y3dFFVRqicLnVZYz"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"disc_number":1,"duration_ms":381706,"explicit":false,"external_ids":{"isrc":"INS179900056"},"external_urls":{"spotify":"https://open.spotify.com/track/6f3C6rJo7zvmfr1h5SRvxg"},"href":"https://api.spotify.com/v1/tracks/6f3C6rJo7zvmfr1h5SRvxg","id":"6f3C6rJo7zvmfr1h5SRvxg","name":"Ladki Badi Anjani Hai","popularity":44,"preview_url":"https://p.scdn.co/mp3-preview/05a7a2c810d8d36b363c0d283d9347f7072bfdde?cid=8897482848704f2a8f8d7c79726a70d4","track_number":8,"type":"track","uri":"spotify:track:6f3C6rJo7zvmfr1h5SRvxg"}],"limit":20,"next":"https://api.spotify.com/v1/search?query=kuch+kuch+hota+hai&type=track&market=US&offset=20&limit=20","offset":0,"previous":null,"total":47}
     */

    private TracksBean tracks;

    public TracksBean getTracks() {
        return tracks;
    }

    public void setTracks(TracksBean tracks) {
        this.tracks = tracks;
    }

    public static class TracksBean {
        /**
         * href : https://api.spotify.com/v1/search?query=kuch+kuch+hota+hai&type=track&market=US&offset=0&limit=20
         * items : [{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"external_urls":{"spotify":"https://open.spotify.com/album/5i3NjuZceh9iqtcODFTM4Q"},"href":"https://api.spotify.com/v1/albums/5i3NjuZceh9iqtcODFTM4Q","id":"5i3NjuZceh9iqtcODFTM4Q","images":[{"height":640,"url":"https://i.scdn.co/image/f7974e7a42a30a43611e84903ff549d8e18f9111","width":640},{"height":300,"url":"https://i.scdn.co/image/af5aa0d1385c814eb0bbd9e62cf57c21d02c3b20","width":300},{"height":64,"url":"https://i.scdn.co/image/28a1a13d2cd07c332dbaa5a02aa4fda70b0814ac","width":64}],"name":"Kuch Kuch Hota Hai","type":"album","uri":"spotify:album:5i3NjuZceh9iqtcODFTM4Q"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"},{"external_urls":{"spotify":"https://open.spotify.com/artist/70B80Lwx2sxti0M1Ng9e8K"},"href":"https://api.spotify.com/v1/artists/70B80Lwx2sxti0M1Ng9e8K","id":"70B80Lwx2sxti0M1Ng9e8K","name":"Udit Narayan","type":"artist","uri":"spotify:artist:70B80Lwx2sxti0M1Ng9e8K"},{"external_urls":{"spotify":"https://open.spotify.com/artist/3gBKY0y3dFFVRqicLnVZYz"},"href":"https://api.spotify.com/v1/artists/3gBKY0y3dFFVRqicLnVZYz","id":"3gBKY0y3dFFVRqicLnVZYz","name":"Alka Yagnik","type":"artist","uri":"spotify:artist:3gBKY0y3dFFVRqicLnVZYz"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"disc_number":1,"duration_ms":297866,"explicit":false,"external_ids":{"isrc":"INS179900049"},"external_urls":{"spotify":"https://open.spotify.com/track/4RixtPhUXlci9ad4qIMj23"},"href":"https://api.spotify.com/v1/tracks/4RixtPhUXlci9ad4qIMj23","id":"4RixtPhUXlci9ad4qIMj23","name":"Kuch Kuch Hota Hai","popularity":45,"preview_url":"https://p.scdn.co/mp3-preview/838f04393c119b9b33bf432e6e5bbad16429024b?cid=8897482848704f2a8f8d7c79726a70d4","track_number":1,"type":"track","uri":"spotify:track:4RixtPhUXlci9ad4qIMj23"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"external_urls":{"spotify":"https://open.spotify.com/album/5i3NjuZceh9iqtcODFTM4Q"},"href":"https://api.spotify.com/v1/albums/5i3NjuZceh9iqtcODFTM4Q","id":"5i3NjuZceh9iqtcODFTM4Q","images":[{"height":640,"url":"https://i.scdn.co/image/f7974e7a42a30a43611e84903ff549d8e18f9111","width":640},{"height":300,"url":"https://i.scdn.co/image/af5aa0d1385c814eb0bbd9e62cf57c21d02c3b20","width":300},{"height":64,"url":"https://i.scdn.co/image/28a1a13d2cd07c332dbaa5a02aa4fda70b0814ac","width":64}],"name":"Kuch Kuch Hota Hai","type":"album","uri":"spotify:album:5i3NjuZceh9iqtcODFTM4Q"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4K6blSRoklNdpw4mzLxwfn"},"href":"https://api.spotify.com/v1/artists/4K6blSRoklNdpw4mzLxwfn","id":"4K6blSRoklNdpw4mzLxwfn","name":"Kumar Sanu","type":"artist","uri":"spotify:artist:4K6blSRoklNdpw4mzLxwfn"},{"external_urls":{"spotify":"https://open.spotify.com/artist/3gBKY0y3dFFVRqicLnVZYz"},"href":"https://api.spotify.com/v1/artists/3gBKY0y3dFFVRqicLnVZYz","id":"3gBKY0y3dFFVRqicLnVZYz","name":"Alka Yagnik","type":"artist","uri":"spotify:artist:3gBKY0y3dFFVRqicLnVZYz"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"disc_number":1,"duration_ms":381706,"explicit":false,"external_ids":{"isrc":"INS179900056"},"external_urls":{"spotify":"https://open.spotify.com/track/6f3C6rJo7zvmfr1h5SRvxg"},"href":"https://api.spotify.com/v1/tracks/6f3C6rJo7zvmfr1h5SRvxg","id":"6f3C6rJo7zvmfr1h5SRvxg","name":"Ladki Badi Anjani Hai","popularity":44,"preview_url":"https://p.scdn.co/mp3-preview/05a7a2c810d8d36b363c0d283d9347f7072bfdde?cid=8897482848704f2a8f8d7c79726a70d4","track_number":8,"type":"track","uri":"spotify:track:6f3C6rJo7zvmfr1h5SRvxg"}]
         * limit : 20
         * next : https://api.spotify.com/v1/search?query=kuch+kuch+hota+hai&type=track&market=US&offset=20&limit=20
         * offset : 0
         * previous : null
         * total : 47
         */

        private String href;
        private int limit;
        private String next;
        private int offset;
        private Object previous;
        private int total;
        private List<ItemsBean> items;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public Object getPrevious() {
            return previous;
        }

        public void setPrevious(Object previous) {
            this.previous = previous;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * album : {"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"}],"available_markets":["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"],"external_urls":{"spotify":"https://open.spotify.com/album/5i3NjuZceh9iqtcODFTM4Q"},"href":"https://api.spotify.com/v1/albums/5i3NjuZceh9iqtcODFTM4Q","id":"5i3NjuZceh9iqtcODFTM4Q","images":[{"height":640,"url":"https://i.scdn.co/image/f7974e7a42a30a43611e84903ff549d8e18f9111","width":640},{"height":300,"url":"https://i.scdn.co/image/af5aa0d1385c814eb0bbd9e62cf57c21d02c3b20","width":300},{"height":64,"url":"https://i.scdn.co/image/28a1a13d2cd07c332dbaa5a02aa4fda70b0814ac","width":64}],"name":"Kuch Kuch Hota Hai","type":"album","uri":"spotify:album:5i3NjuZceh9iqtcODFTM4Q"}
             * artists : [{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"},{"external_urls":{"spotify":"https://open.spotify.com/artist/70B80Lwx2sxti0M1Ng9e8K"},"href":"https://api.spotify.com/v1/artists/70B80Lwx2sxti0M1Ng9e8K","id":"70B80Lwx2sxti0M1Ng9e8K","name":"Udit Narayan","type":"artist","uri":"spotify:artist:70B80Lwx2sxti0M1Ng9e8K"},{"external_urls":{"spotify":"https://open.spotify.com/artist/3gBKY0y3dFFVRqicLnVZYz"},"href":"https://api.spotify.com/v1/artists/3gBKY0y3dFFVRqicLnVZYz","id":"3gBKY0y3dFFVRqicLnVZYz","name":"Alka Yagnik","type":"artist","uri":"spotify:artist:3gBKY0y3dFFVRqicLnVZYz"}]
             * available_markets : ["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"]
             * disc_number : 1
             * duration_ms : 297866
             * explicit : false
             * external_ids : {"isrc":"INS179900049"}
             * external_urls : {"spotify":"https://open.spotify.com/track/4RixtPhUXlci9ad4qIMj23"}
             * href : https://api.spotify.com/v1/tracks/4RixtPhUXlci9ad4qIMj23
             * id : 4RixtPhUXlci9ad4qIMj23
             * name : Kuch Kuch Hota Hai
             * popularity : 45
             * preview_url : https://p.scdn.co/mp3-preview/838f04393c119b9b33bf432e6e5bbad16429024b?cid=8897482848704f2a8f8d7c79726a70d4
             * track_number : 1
             * type : track
             * uri : spotify:track:4RixtPhUXlci9ad4qIMj23
             */

            private AlbumBean album;
            private int disc_number;
            private int duration_ms;
            private boolean explicit;
            private ExternalIdsBean external_ids;
            private ExternalUrlsBeanXX external_urls;
            private String href;
            private String id;
            private String name;
            private int popularity;
            private String preview_url;
            private int track_number;
            private String type;
            private String uri;
            private List<ArtistsBeanX> artists;
            private List<String> available_markets;

            public AlbumBean getAlbum() {
                return album;
            }

            public void setAlbum(AlbumBean album) {
                this.album = album;
            }

            public int getDisc_number() {
                return disc_number;
            }

            public void setDisc_number(int disc_number) {
                this.disc_number = disc_number;
            }

            public int getDuration_ms() {
                return duration_ms;
            }

            public void setDuration_ms(int duration_ms) {
                this.duration_ms = duration_ms;
            }

            public boolean isExplicit() {
                return explicit;
            }

            public void setExplicit(boolean explicit) {
                this.explicit = explicit;
            }

            public ExternalIdsBean getExternal_ids() {
                return external_ids;
            }

            public void setExternal_ids(ExternalIdsBean external_ids) {
                this.external_ids = external_ids;
            }

            public ExternalUrlsBeanXX getExternal_urls() {
                return external_urls;
            }

            public void setExternal_urls(ExternalUrlsBeanXX external_urls) {
                this.external_urls = external_urls;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPopularity() {
                return popularity;
            }

            public void setPopularity(int popularity) {
                this.popularity = popularity;
            }

            public String getPreview_url() {
                return preview_url;
            }

            public void setPreview_url(String preview_url) {
                this.preview_url = preview_url;
            }

            public int getTrack_number() {
                return track_number;
            }

            public void setTrack_number(int track_number) {
                this.track_number = track_number;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public List<ArtistsBeanX> getArtists() {
                return artists;
            }

            public void setArtists(List<ArtistsBeanX> artists) {
                this.artists = artists;
            }

            public List<String> getAvailable_markets() {
                return available_markets;
            }

            public void setAvailable_markets(List<String> available_markets) {
                this.available_markets = available_markets;
            }

            public static class AlbumBean {
                /**
                 * album_type : album
                 * artists : [{"external_urls":{"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"},"href":"https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ","id":"4YgUVg4p7xtMOrOS4GjiJZ","name":"Jatin-Lalit","type":"artist","uri":"spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ"}]
                 * available_markets : ["AD","AR","AT","AU","BE","BG","BO","BR","CA","CH","CL","CO","CR","CY","CZ","DE","DK","DO","EC","EE","ES","FI","FR","GB","GR","GT","HK","HN","HU","ID","IE","IS","IT","LI","LT","LU","LV","MC","MT","MX","MY","NI","NL","NO","NZ","PA","PE","PH","PL","PT","PY","SE","SG","SK","SV","TR","TW","US","UY"]
                 * external_urls : {"spotify":"https://open.spotify.com/album/5i3NjuZceh9iqtcODFTM4Q"}
                 * href : https://api.spotify.com/v1/albums/5i3NjuZceh9iqtcODFTM4Q
                 * id : 5i3NjuZceh9iqtcODFTM4Q
                 * images : [{"height":640,"url":"https://i.scdn.co/image/f7974e7a42a30a43611e84903ff549d8e18f9111","width":640},{"height":300,"url":"https://i.scdn.co/image/af5aa0d1385c814eb0bbd9e62cf57c21d02c3b20","width":300},{"height":64,"url":"https://i.scdn.co/image/28a1a13d2cd07c332dbaa5a02aa4fda70b0814ac","width":64}]
                 * name : Kuch Kuch Hota Hai
                 * type : album
                 * uri : spotify:album:5i3NjuZceh9iqtcODFTM4Q
                 */

                private String album_type;
                private ExternalUrlsBean external_urls;
                private String href;
                private String id;
                private String name;
                private String type;
                private String uri;
                private List<ArtistsBean> artists;
                private List<String> available_markets;
                private List<ImagesBean> images;

                public String getAlbum_type() {
                    return album_type;
                }

                public void setAlbum_type(String album_type) {
                    this.album_type = album_type;
                }

                public ExternalUrlsBean getExternal_urls() {
                    return external_urls;
                }

                public void setExternal_urls(ExternalUrlsBean external_urls) {
                    this.external_urls = external_urls;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<ArtistsBean> getArtists() {
                    return artists;
                }

                public void setArtists(List<ArtistsBean> artists) {
                    this.artists = artists;
                }

                public List<String> getAvailable_markets() {
                    return available_markets;
                }

                public void setAvailable_markets(List<String> available_markets) {
                    this.available_markets = available_markets;
                }

                public List<ImagesBean> getImages() {
                    return images;
                }

                public void setImages(List<ImagesBean> images) {
                    this.images = images;
                }

                public static class ExternalUrlsBean {
                    /**
                     * spotify : https://open.spotify.com/album/5i3NjuZceh9iqtcODFTM4Q
                     */

                    private String spotify;

                    public String getSpotify() {
                        return spotify;
                    }

                    public void setSpotify(String spotify) {
                        this.spotify = spotify;
                    }
                }

                public static class ArtistsBean {
                    /**
                     * external_urls : {"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"}
                     * href : https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ
                     * id : 4YgUVg4p7xtMOrOS4GjiJZ
                     * name : Jatin-Lalit
                     * type : artist
                     * uri : spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ
                     */

                    private ExternalUrlsBeanX external_urls;
                    private String href;
                    private String id;
                    private String name;
                    private String type;
                    private String uri;

                    public ExternalUrlsBeanX getExternal_urls() {
                        return external_urls;
                    }

                    public void setExternal_urls(ExternalUrlsBeanX external_urls) {
                        this.external_urls = external_urls;
                    }

                    public String getHref() {
                        return href;
                    }

                    public void setHref(String href) {
                        this.href = href;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public static class ExternalUrlsBeanX {
                        /**
                         * spotify : https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ
                         */

                        private String spotify;

                        public String getSpotify() {
                            return spotify;
                        }

                        public void setSpotify(String spotify) {
                            this.spotify = spotify;
                        }
                    }
                }

                public static class ImagesBean {
                    /**
                     * height : 640
                     * url : https://i.scdn.co/image/f7974e7a42a30a43611e84903ff549d8e18f9111
                     * width : 640
                     */

                    private int height;
                    private String url;
                    private int width;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }
                }
            }

            public static class ExternalIdsBean {
                /**
                 * isrc : INS179900049
                 */

                private String isrc;

                public String getIsrc() {
                    return isrc;
                }

                public void setIsrc(String isrc) {
                    this.isrc = isrc;
                }
            }

            public static class ExternalUrlsBeanXX {
                /**
                 * spotify : https://open.spotify.com/track/4RixtPhUXlci9ad4qIMj23
                 */

                private String spotify;

                public String getSpotify() {
                    return spotify;
                }

                public void setSpotify(String spotify) {
                    this.spotify = spotify;
                }
            }

            public static class ArtistsBeanX {
                /**
                 * external_urls : {"spotify":"https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ"}
                 * href : https://api.spotify.com/v1/artists/4YgUVg4p7xtMOrOS4GjiJZ
                 * id : 4YgUVg4p7xtMOrOS4GjiJZ
                 * name : Jatin-Lalit
                 * type : artist
                 * uri : spotify:artist:4YgUVg4p7xtMOrOS4GjiJZ
                 */

                private ExternalUrlsBeanXXX external_urls;
                private String href;
                private String id;
                private String name;
                private String type;
                private String uri;

                public ExternalUrlsBeanXXX getExternal_urls() {
                    return external_urls;
                }

                public void setExternal_urls(ExternalUrlsBeanXXX external_urls) {
                    this.external_urls = external_urls;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public static class ExternalUrlsBeanXXX {
                    /**
                     * spotify : https://open.spotify.com/artist/4YgUVg4p7xtMOrOS4GjiJZ
                     */

                    private String spotify;

                    public String getSpotify() {
                        return spotify;
                    }

                    public void setSpotify(String spotify) {
                        this.spotify = spotify;
                    }
                }
            }
        }
    }
}
