<template>
  <div class="details" v-bind:class="{ isbn : book.isbn}">
      <h2 class="book-title">{{book.title}}</h2>
      <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h3 class="book-author">{{ book.author }}</h3>
  </div>
</template>

<script>

export default {

  name: 'book-details',
  data() {
      return {
          title: '',
          author: '',
          read: false,
          isbn: ''
      }
  },
//   computed: {
//       book() {
//           return this.$store.state.books.find(book => {
//               return book.isbn === this.$store.state.currentBook;
//           });
//       }
//   },

}
</script>

<style>

</style>