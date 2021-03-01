<template>
  <div class="details" v-bind:class="{ isbn : book.isbn}" >
      <h2 class="book-title">{{book.title}}</h2>
      <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h3 class="book-author">{{ book.author }}</h3>
    <!-- <reading-list /> -->
    <!-- <router-link v-bind:to="{name: 'reading-list', params: {isbn: book.isbn}}">{{book.title}}</router-link> -->
  </div>
  
</template>

<script>
// import ReadingList from './ReadingList.vue';

export default {
  // components: { ReadingList },
  name: 'book-details',
  data() {
      return {
          title: '',
          author: '',
          read: false,
          isbn: ''
      }
  },
  created () {
    this.isbn = this.$route.params.isbn;
    this.$store.commit('SET_ACTIVE_BOOK', this.isbn);
  },
  computed: {
      book() {
          return this.$store.state.books.find(book => {
              return book.isbn === this.$store.state.currentBook;
          });
      }
  },

}
</script>

<style>

</style>