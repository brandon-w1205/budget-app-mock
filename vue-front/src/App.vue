<script setup lang="ts">
import HelloWorld from './components/HelloWorld.vue'
import GetStarted from './components/GetStarted.vue'
import Dashboard from './components/Dashboard.vue'
import DoughnutChart from './components/charts/DoughnutChart.vue';
</script>

<template>
  <!-- <HelloWorld msg="Vite + Vue + TS" /> -->
  <GetStarted />
  <!-- <Dashboard /> -->
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}

.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}

.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
