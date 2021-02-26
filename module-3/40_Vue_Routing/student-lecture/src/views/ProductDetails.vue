<template>
  <div id="app" class="main">
    <h1>Product Reviews for {{ product.name }}</h1>
    <p class="description">{{ product.description }}</p>

    <div class="well-display">
      <average-summary />
      <star-summary rating="1" />
      <star-summary rating="2"  />
      <star-summary rating="3"  />
      <star-summary rating="4"  />
      <star-summary rating="5"  />
    </div>

    <review-list />

  </div>
</template>

<script>
import AverageSummary from '@/components/reviews/summary/AverageSummary.vue';
import ReviewList from '@/components/reviews/ReviewList.vue';
import StarSummary from '@/components/reviews/summary/StarSummary.vue';

export default {
  name: "app",
  components: {
    AverageSummary,
    StarSummary,
    ReviewList
  },
  computed: {
      product() {
          return this.$store.state.products.find(product => {
              return product.id === this.$store.state.activeProduct;
          });
      }
  }
};
</script>
    StarSummary

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  max-width: 800px;
  margin: 60px auto 0 auto;
}
div.main {
  margin: 1rem 0;
}
div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.well-display div.well {
  cursor: pointer;
}
</style>
